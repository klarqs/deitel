package com.serializable;

import jakarta.xml.bind.JAXB;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SequentialFileCreator {
    public static void main(String[] args) throws IOException {

        Account bob = new Account(100, "Bob", "Blue", 24.98);
        Account sue = new Account(200, "Sue", "Yellow", 224.62);
        Accounts accounts = new Accounts();

        try
        {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("clients.xml"));
            accounts.getAccounts().add(bob);
            accounts.getAccounts().add(sue);
            JAXB.marshal(accounts, writer);
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }
}