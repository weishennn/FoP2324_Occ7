package lab10.L10Q3;

public class Tester {
    public static void main(String[] args) {
        ShuffleCipher plainToCipher = new ShuffleCipher("plainText.txt", "shuffleCipherText.txt", 2);
        plainToCipher.plainToCipher();

        ShuffleCipher cipherToPlain = new ShuffleCipher("shuffleCipherText.txt", "shuffleDecodedPlainText.txt", 2);
        cipherToPlain.cipherToPlain();
    }
}