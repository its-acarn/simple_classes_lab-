public class Printer {
    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner) {
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheetsLeft;
    }

    public int getToner() {
        return this.toner;
    }

    public void print(int num_pages, int num_copies ) {
        int total_sheets = num_pages * num_copies;
        if( total_sheets < this.sheetsLeft && total_sheets < toner) {
            this.sheetsLeft = this.sheetsLeft - total_sheets;
            this.toner = this.toner - total_sheets;
        } else {
            return;
        }
    }
}
