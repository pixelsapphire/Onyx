/*
 * Copyright (c) 2021 RubyNaxela
 * All Rights Reserved
 *
 * This file is part of the Onyx project.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 *
 * Written by Jacek Pawelski <rubynaxela@gmail.com>
 */

package com.rubynaxela.onyx.data.datatypes;

public abstract class Transaction implements Operation {

    private String uuid, contractorUuid;
    private double amount;

    @Override
    public String getUuid() {
        return uuid;
    }

    public double getAmount() {
        return amount;
    }

    public String getContractorUuid() {
        return contractorUuid;
    }
}