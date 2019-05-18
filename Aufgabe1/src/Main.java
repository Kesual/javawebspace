
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new MyFrameA(1111, 200, 200);

        new MyFrameB(2013, 200, 200,  1);

		new MyFrameC("Zahlen", 300, generateNumbers(2, 100, 2));

        new MyFrameD(1111, 300, 300, "Kreis", 1);


	}

    public static int[] generateNumbers(int von, int bis, int schritte){

        int[] array = new int[(bis / schritte)];

        for (int i = 0; i < (bis / schritte); i ++) {

            array[i] = von;
             von = von + schritte;

        }

        return array;
    }

}
