/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker;

import org.opendaylight.controller.sal.core.api.Broker.ProviderSession;
import org.opendaylight.controller.sal.core.api.Provider;

class ProviderContextImpl extends ConsumerContextImpl implements ProviderSession {
    private final Provider provider;

    ProviderContextImpl(final Provider provider, final BrokerImpl broker) {
        super(null, broker);
        this.provider = provider;
    }

    @Override
    public void close() {
    }

    public Provider getProvider() {
        return provider;
    }
}
