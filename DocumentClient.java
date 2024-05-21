import java.util.Scanner;

public class DocumentClient {
    public static void main(String[] args) {
        IDocument doc = new NormalDoc();
        Scanner sc = new Scanner(System.in);
        String encryption = sc.nextLine();
        String extension = sc.nextLine();
        doc.SetEncryption(encryption);
        doc.SetExtension(extension);
        Document document = doc.buildDoc();
        System.out.println(document+" "+doc.getClass().getName());
    }
}
