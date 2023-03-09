package br.dev.pedrolamarao.impl;

import br.dev.pedrolamarao.api.Service;

public class ProviderImpl implements br.dev.pedrolamarao.spi.Provider
{
    @Override
    public Service provide ()
    {
        return new ServiceImpl();
    }
}
