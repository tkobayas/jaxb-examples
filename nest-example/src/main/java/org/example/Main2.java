package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main2 {

    private JAXBContext context = JAXBContext.newInstance(Book.class, Author.class);

    public static void main(String[] args) throws Exception {
        Main2 main = new Main2();
        main.marshal();

        System.out.println("-------");

        Author author = main.unmarshall();
        System.out.println(author);
    }

    public Main2() throws Exception {
        super();
    }

    public void marshal() throws JAXBException, IOException {
        Author author = new Author("John");

        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(author, System.out);

        System.out.println("-----");
        mar.marshal(author, new File("./author.xml"));
    }

    public Author unmarshall() throws JAXBException, IOException {
        return (Author) context.createUnmarshaller()
                             .unmarshal(new FileReader("./author.xml"));
    }
}
