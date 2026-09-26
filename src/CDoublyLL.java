public class CDoublyLL extends ParentLL {

    public void add(int index, String info) {
        // If the list is currently empty

        try {

            //TODO: YOUR CODE HERE

        } catch (Exception e) {
            System.out.println("\u001B[31m" + this.getClass().getName() + " invalid index provided: add(" + index
                    + ", \"" + info + "\")\u001B[30m");
        }
    }

    public void remove(int index) {

        try {

            //TODO: YOUR CODE HERE


        } catch (Exception e) {
            System.out.println("\u001B[31m" + this.getClass().getName() + " invalid index provided: remove(" + index
                    + ")\u001B[30m");
        }
    }

    public void printAll() {

        try {
            
            //TODO: YOUR CODE HERE

        } catch (Exception e) {
            System.out.println("\u001B[31m" + this.getClass().getName() + " something went wrong in print()\u001B[30m");
        }

    }

    public void revPrintAll() {

        try {

            //TODO: YOUR CODE HERE


        } catch (Exception e) {
            System.out.println(
                    "\u001B[31m" + this.getClass().getName() + " something went wrong in revprint()\u001B[30m");

        }
    }

}
