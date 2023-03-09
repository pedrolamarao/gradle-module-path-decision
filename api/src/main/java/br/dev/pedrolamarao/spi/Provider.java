package br.dev.pedrolamarao.spi;

import br.dev.pedrolamarao.api.Service;

public interface Provider
{
    Service provide ();
}