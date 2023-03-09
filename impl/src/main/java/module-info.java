import br.dev.pedrolamarao.impl.ProviderImpl;
import br.dev.pedrolamarao.spi.Provider;

module br.dev.pedrolamarao.impl
{
    requires br.dev.pedrolamarao.api;
    provides Provider with ProviderImpl;
}