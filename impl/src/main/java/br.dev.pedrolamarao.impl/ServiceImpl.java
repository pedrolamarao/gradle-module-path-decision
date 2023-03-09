package br.dev.pedrolamarao.impl;

import br.dev.pedrolamarao.api.Service;

final class ServiceImpl implements Service
{
    @Override
    public String request ()
    {
        return "Hello World!";
    }
}
