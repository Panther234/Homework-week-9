package homework_week_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write the programme that tell you which line pass through particular stations.
 * Just use Zone 1 stations name.
 */
public class Question10 {

    public static void main(String[] args) {
        Map<String, String> underground = new HashMap<String, String>();
        underground.put("Aldgate","Metropolitan line & Circle line" );
        underground.put("Aldgate East","Hammersmith & City line and District line" );
        underground.put("Angel","Northern line" );
        underground.put("Baker Street","Metropolitan line & Bakerloo line & Circle line & Jubilee line &Hammersmith & City line" );
        underground.put("Bank","Waterloo & City line & Northern line & Central line" );
        underground.put("Barbican","Metropolitan line & Circle line & Hammersmith & City line" );
        underground.put("Bayswater","District line  & Circle line " );
        underground.put("Bond Street","Central line & Jubilee line" );
        underground.put("Borough","Northern line" );
        underground.put("Charing Cross","Bakerloo line & Northern line" );
        underground.put("Edgware Road","Bakerloo line" );
        underground.put("Euston","Northern line &  Victoria line" );


        char result;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Station Name: ");
            String stationName = scanner.nextLine();
            for (String str : underground.keySet()) {
                if (stationName.equals(str)) {
                    System.out.println("Tube Lines: " + underground.get(str));
                }
            }
            System.out.println(" ");
            System.out.println("Do you want to continue 'Y' or 'N': ");
            result = scanner.next().charAt(0);
        } while (result == 'Y' || result == 'y');

    }

}


