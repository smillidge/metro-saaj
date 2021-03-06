/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

import com.sun.xml.soap.*;

import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPException;

public class SampleRecipient extends SOAPRecipient {

    public void acceptHeaderElement(
        SOAPHeaderElement elem,
        ProcessingContext context)
        throws SOAPException {

        System.out.println("Processed header block : " +
                            elem.getTagName());
    }

    public void handleIncomingFault(ProcessingContext context) {
    }

    public void handleOutgoingFault(ProcessingContext context) {
    }

}
