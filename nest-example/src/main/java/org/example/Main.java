package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {

    private JAXBContext context = JAXBContext.newInstance(Book.class, Author.class);

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.marshal();

        System.out.println("-------");

        Book book = main.unmarshall();
        System.out.println(book);
    }

    public Main() throws Exception {
        super();
    }

    public void marshal() throws JAXBException, IOException {
        Book book = new Book();
        book.setId(1L);
        book.setName("Book1");
        book.setAuthor(new Author("John"));

        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(book, System.out);

        System.out.println("-----");
        mar.marshal(book, new File("./book.xml"));
    }

    public Book unmarshall() throws JAXBException, IOException {
        return (Book) context.createUnmarshaller()
                             .unmarshal(new FileReader("./book.xml"));
    }
}
