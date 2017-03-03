import java.util.Scanner;

public class percobaan
{
	public static void main(String [] args)
	{
		String nama;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukkan nama anda");
		nama = s.nextLine();
		System.out.println("------------------");
		System.out.println("Nama anda : "+nama);
	}
}