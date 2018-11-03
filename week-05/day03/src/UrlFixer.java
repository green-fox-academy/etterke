public class UrlFixer {

    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        String url1 = url.substring(0, 4);
        String url2 = url.substring(5);
        String colon = ":";

        System.out.println(url1 + colon + url2);
    }
}
