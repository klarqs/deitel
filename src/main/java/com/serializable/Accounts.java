package com.serializable;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;

public class Accounts {
    @XmlElement(name = "account")
    private List<Account> accounts = new ArrayList<Account>();

    public List<Account> getAccounts()
    {
        return accounts;
    }
}
