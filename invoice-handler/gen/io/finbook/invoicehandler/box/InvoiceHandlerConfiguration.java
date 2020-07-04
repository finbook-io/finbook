package io.finbook.invoicehandler.box;

import java.util.Map;
import java.util.HashMap;

public class InvoiceHandlerConfiguration extends io.intino.alexandria.core.BoxConfiguration {

	public InvoiceHandlerConfiguration(String[] args) {
		super(args);
	}

	public String datahubUrl() {
		return get("datahub_url");
	}

	public String datahubUser() {
		return get("datahub_user");
	}

	public String datahubPassword() {
		return get("datahub_password");
	}

	public String datahubClientid() {
		return get("datahub_clientId");
	}

	public String datahubOutboxDirectory() {
		return get("datahub_outbox_directory");
	}

	public String datalakeDirectory() {
		return get("datalake_directory");
	}
}