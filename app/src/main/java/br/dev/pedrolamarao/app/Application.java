package br.dev.pedrolamarao.app;

import br.dev.pedrolamarao.api.Service;

import java.util.ServiceLoader;

public class Application
{
    public static void main (String[] args)
    {
        final var service = Service.load();
        System.out.printf("%s%n",service.request());
    }
}
