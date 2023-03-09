import br.dev.pedrolamarao.spi.Provider;

module br.dev.pedrolamarao.api
{
    exports br.dev.pedrolamarao.api;
    exports br.dev.pedrolamarao.spi to br.dev.pedrolamarao.impl;

    uses Provider;
}