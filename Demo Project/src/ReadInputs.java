import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadInputs {
    public static int noOfLines;
    public static double[] arr1;
    public static double[] arr2;
    public static double[] arr3;
    public static double[] arr4;
    public static String[] region;
    public static String[] country;

    //    long noOfLines=0;
    public static List<String> readInputs(){
        //File file = new File("C:\\Users\\veer5\\IdeaProjects\\Demo Project\\src\\Inputs.txt");
        String path = "C:\\Users\\veer5\\IdeaProjects\\Demo Project\\src\\Inputs.txt";
        List<String> stringList = bufferReaderToArrayList(path);
//        System.out.println(Arrays.toString(stringList.toArray()));
        int k = noOfLines;
        if(k != 0) {
            arr1 = new double[k];
            arr2 = new double[k];
            arr3 = new double[k];
            arr4 = new double[k];
            region = new String[k];
            country = new String[k];
            String[] strArray= new String[6];
            for (int i = 0; i < k; i++) {
//                System.out.println();
                Scanner sc = new Scanner(stringList.get(i));
//                String[] strArray = stringList.get(i).split("\\s", 6);
                int j=0;
                while(sc.hasNext() && j<6) {
                    String value = sc.next();
//                    System.out.println("    value: "+value);
                    strArray[j++] = value;
                }
//                System.out.println("j: "+j);
                System.out.println("i: "+i+"   "+ Arrays.toString(strArray));
                arr1[i] = Double.parseDouble(strArray[0]);
                arr2[i] = Double.parseDouble(strArray[1]);
                arr3[i] = Double.parseDouble(strArray[2]);
                arr4[i] = Double.parseDouble(strArray[3]);
                region[i] = strArray[4];
                country[i] = strArray[5];
//                arr1[i] = Double.parseDouble(strArray[0]);
//                arr2[i] = Double.parseDouble(strArray[1]);
//                arr3[i] = Double.parseDouble(strArray[2]);
//                arr4[i] = Double.parseDouble(strArray[3]);
//                region[i] = strArray[4];
//                country[i] = strArray[5];
            }
//            System.out.println("i: "+"   "+Arrays.toString(arr1));
//            System.out.println("i: "+"   "+Arrays.toString(arr2));
//            System.out.println("i: "+"   "+Arrays.toString(arr3));
//            System.out.println("i: "+"   "+Arrays.toString(arr4));
//            System.out.println("i: "+"   "+Arrays.toString(region));
//            System.out.println("i: "+"   "+Arrays.toString(country));

        }
        return stringList;
    }
    private static List<String> bufferReaderToArrayList(String path) {
        return bufferReaderToList(path, new ArrayList<>());
    }
    private static List<String> bufferReaderToList(String path, List<String> list) {
        try {
            final BufferedReader in = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8));
            String line;
            noOfLines=0;
            while ((line = in.readLine()) != null) {
                list.add(line);
                noOfLines++;
            }
            in.close();
        } catch (final IOException e){
            e.printStackTrace();
        }
        return list;
    }
    /*
    public static void read() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(
                new File("C:\\Users\\veer5\\IdeaProjects\\Demo Project\\src\\Inputs.txt"));
        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        int limit = byteBuffer.limit();
        System.out.println(limit+"<--limit");
        while(limit>0)
        {
            System.out.print((char)byteBuffer.get());
            limit--;
        }

        fileChannel.close();
    }
    */
}
