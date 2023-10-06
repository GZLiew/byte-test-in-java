/*
 * Only classes with 'Main' name are accepted in CodeChef and some other online judges
 */
public class Main {
    private static final int BIT_SIZE = 8;

    // Program's starting point
    public static void main(String[] args) {
        System.out.println("Starting");

        // 0000 0100
        findActiveBit((byte) 0x04);
        // 0000 0000
        findActiveBit((byte) 0x00);
        // 0000 0001
        findActiveBit((byte) 0x01);
        // 0000 0010
        findActiveBit((byte) 0x02);
        // 0000 1000
        findActiveBit((byte) 0x08);
        // 0001 0000
        findActiveBit((byte) 0x10);
        // 1000 0000
        findActiveBit((byte) 0x80);
        // 1111 0000
        findActiveBit((byte) 0xF0);
        // 1111 1111
        findActiveBit((byte) 0xFF);

        System.out.println("peace out ✌️");
    }

    private static int findActiveBit(byte hexCode) {
        System.out.println("finding active bit for 0x" + String.format("%02X", hexCode));
        int found = -1;
        for (int i = 0; i < BIT_SIZE; i++) {
            if ((hexCode & (1 << i)) != 0) {
                found = i;
                break;
            }
        }
        if (found == -1) {
            System.out.println("no active bit found");
        } else {
            System.out.println("Active bit at index " + found);
        }
        return found;
    }
}
