package opps;

class NoteBook {
	private int page;
	private double price;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class LaunchNoteBook {

	public static void main(String[] args) {
		NoteBook nb1 = new NoteBook();
		nb1.setPage(300);
		nb1.setPrice(150.0);

		NoteBook nb2 = new NoteBook();
		nb2.setPage(500);
		nb2.setPrice(220.0);

		NoteBook[] nb = new NoteBook[2];
		nb[0] = nb1;
		nb[1] = nb2;

		for (int i = 0; i < nb.length; i++) {
			System.out.println("Pages:" + nb[i].getPage() + "\nPrice:" + nb[i].getPrice());
		}
	}

}
