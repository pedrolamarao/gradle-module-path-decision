package br.dev.pedrolamarao.api;

import br.dev.pedrolamarao.spi.Provider;

import java.util.NoSuchElementException;
import java.util.ServiceLoader;

public interface Service
{
    String request ();

    static Service load ()
    {
        final var loader = ServiceLoader.load(Provider.class);
        for (var provider : loader) {
            final var service = provider.provide();
            if (service != null) return service;
        }
        throw new NoSuchElementException();
    }
}
