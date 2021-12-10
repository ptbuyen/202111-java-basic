package lab6;

public class DomainBuilder {

    public static String buildUrl (String domainName, SslType sslType, DomainType domainType)
    {
        String urlPrefix;
        String finalDomainType;

        urlPrefix = getUrlPrefix(sslType);
        finalDomainType = getFinalDoaminType(domainType);

        return urlPrefix.concat("://").concat(domainName).concat(finalDomainType);
    }

    private static String getUrlPrefix(SslType sslType) {
        String urlPrefix = "";
        switch (sslType){
            case TRUE:
                urlPrefix = "https";
                break;
            case FALSE:
                urlPrefix = "http";
                break;
            default:
                System.out.println("SSL type is incorrect!");
        }

        return  urlPrefix;
    }

    private static String getFinalDoaminType(DomainType domainType) {
        String finalDomainType = "";
        switch (domainType){
            case NET:
                finalDomainType = ".net";
                break;
            case COM:
                finalDomainType = ".com";
                break;
            case APP:
                finalDomainType = ".app";
                break;
            case IO:
                finalDomainType = ".io";
            case AI:
                finalDomainType = ".ai";
            default:
                System.out.println("Domain type is incorrect!");
        }

        return  finalDomainType;
    }

    public static void main(String[] args) {
        System.out.println(DomainBuilder.buildUrl("google", SslType.TRUE, DomainType.COM));
    }
}
