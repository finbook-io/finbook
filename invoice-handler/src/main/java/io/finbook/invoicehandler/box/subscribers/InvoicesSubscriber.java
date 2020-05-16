package io.finbook.invoicehandler.box.subscribers;

import io.finbook.TextGenerator;
import io.finbook.datahub.events.ProcessedInvoices;
import io.finbook.invoicehandler.box.InvoiceHandlerBox;
import io.finbook.invoicehandler.box.helpers.XMLHelper;

public class InvoicesSubscriber implements java.util.function.Consumer<io.finbook.datahub.events.Invoices> {
	private InvoiceHandlerBox box;

	public InvoicesSubscriber(InvoiceHandlerBox box) {
		this.box = box;
	}

	public void accept(io.finbook.datahub.events.Invoices event) {
		System.out.println("Subscribe");
		String xml = TextGenerator.getAsciiTextFrom(event.xml());
		System.out.println(xml);
		XMLHelper xmlHelper = new XMLHelper(xml);
		ProcessedInvoices processedInvoice = xmlHelper.getProcessedInvoice();
		box.terminal().publish(processedInvoice);
	}
}