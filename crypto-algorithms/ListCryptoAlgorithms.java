import java.security.Provider;
import java.security.Security;
import java.util.Set;

public class ListCryptoAlgorithms {
    public static void main(String[] args) {
        Provider[] providers = Security.getProviders();
        for (Provider provider : providers) {
            System.out.println("Provider: " + provider.getName());
            Set<Provider.Service> services = provider.getServices();
            for (Provider.Service service : services) {
                System.out.println("  Algorithm: " + service.getAlgorithm());
            }
        }
    }
}
