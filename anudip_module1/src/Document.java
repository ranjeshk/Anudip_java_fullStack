

public class Document {
	void open() {
	}

	public static void main(String[] args) {
		Document doc1 = new WordDocument();
		doc1.open();

		Document doc2 = new PDFDocument();
		doc2.open();

		Document doc3 = new PDFDocument();
		doc3.open();

	}

}

//first class
class WordDocument extends Document {
	// implementing open()
	void open() {
		System.out.println("opening word document! ");
	}

}

//second class
class PDFDocument extends Document {
	// implementing open()
	void open() {
		System.out.println("opening PDF document! ");
	}

}

//third class
class SpredsheetDocument extends Document {
	// implementing open()
	void open() {
		System.out.println("opening SpreadSheet document! ");
	}

}
