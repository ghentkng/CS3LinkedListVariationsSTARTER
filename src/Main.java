public class Main {
    public static void main(String[] args) {

        SinglyLL sll = new SinglyLL();
        //  testPrintingElems(sll);
        //   testAddingElems(sll);
        //   testRemovingElems(sll);
        //   testReversePrintingElems(sll);

        DoublyLL dll = new DoublyLL();
        // testPrintingElems(dll);
        // testReversePrintingElems(dll);
        // testAddingElems(dll);
        // testRemovingElems(dll);

        CSinglyLL csll = new CSinglyLL();
        // testPrintingElems(csll);
        // testAddingElems(csll);
        // testRemovingElems(csll);
        // testReversePrintingElems(csll);

        CDoublyLL cdll = new CDoublyLL();
        // testPrintingElems(cdll);
        // testAddingElems(cdll);
        // testRemovingElems(cdll);
        // testReversePrintingElems(cdll);

        }

/*
        This test attempts to perform the following operations:
        add "Isaiah" at index 0
        add "Nathan" at index 0
        add "Oakley" at index 2
        add "Sterling" at index 1
        add "Jaden" at index 10 (invalid operation)
*/
        public static void testAddingElems(ParentLL list) {

        System.out.println("\n\n" + list.getClass().getName()
                + " TEST ADDING* ELEMENTS ---------------------------------------------------------------");

        list.add(0, "Isaiah"); // add to empty
        list.add(0, "Nathan"); // add to front
        list.add(2, "Oakley"); // add to end
        list.add(1, "Sterling"); // add to middle

        System.out.println("\tActual output:");
        System.out.print("\t| ");
        list.printAll();
        System.out.print("\t| ");
        list.add(10, "Jaden");// invalid add (IOOB)

        System.out.println("\tExpected output:");
        System.out.println("\t| Isaiah, Sterling, Nathan, Oakley");
        System.out.println("\t| \u001B[31m" + list.getClass().getName() + " invalid index provided: add(" + 10
                + ", \"" + "Jaden" + "\")\u001B[30m");

        list.clear();
        System.out.println("\n\t*This test utilizes print(). If it failed, the issue could be in 'print()' or 'add()'.");

        }

/*
        This test attempts to perform the following operations:
        add "Landon" at index 0
        add "Damon" at index 1
        add "Bishop" at index 2
        add "Isaiah" at index 3
        print the LL in order
*/
        public static void testPrintingElems(ParentLL list) {

                System.out.println("\n\n" + list.getClass().getName()
                        + " TEST PRINTING* ELEMENTS -----------------------------------------------------------");

                list.add(0, "Landon");
                list.add(1, "Damon");
                list.add(2, "Bishop");
                list.add(3, "Isaiah");

                System.out.println("\tActual output:");
                System.out.print("\t| ");
                list.printAll();

                System.out.println("\tExpected output:");
                System.out.println("\t| Landon, Damon, Bishop, Isaiah");

                list.clear();
                System.out.println("\n\t*This test utilizes add(). If it failed, the issue could be in 'print()' or 'add()'.");

        }

/*
        This test attempts to perform the following operations:
        add "Nathan" at index 0
        add "Oakley" at index 1
        add "Sterling" at index 2
        add "Jaden" at index 3
        print the LL in reverse order
*/
        public static void testReversePrintingElems(ParentLL list) {

                System.out.println("\n\n" + list.getClass().getName()
                        + " TEST REVERSE PRINTING* ELEMENTS ---------------------------------------------------");

                list.add(0, "Nathan");
                list.add(1, "Oakley");
                list.add(2, "Sterling");
                list.add(3, "Jaden");

                System.out.println("\tActual output:");
                System.out.print("\t| ");
                list.revPrintAll();

                System.out.println("\tExpected output:");
                Class<?> runtimeClass = list.getClass();
                try {
                        runtimeClass.getDeclaredMethod("revPrintAll");
                                        System.out.println("\t| Jaden, Sterling, Oakley, Nathan");
                } catch (NoSuchMethodException e) {
                        System.out.println("\t| " + runtimeClass.getName() + " does not have the ability to access in reverse.");
                }

                list.clear();
                System.out.println("\n\t*This test utilizes add(). If it failed, the issue could be in 'revprint()' or 'add()'.");

        }
/*
        This test attempts to perform the following operations:
        remove from an empty list (invalid operation)
        add "Landon" at index 0
        remove the element at 0 (Landon)
        add "Damon" at index 0
        add "Bishop" at index 1
        add "Isaiah" at index 2
        add "Nathan" at index 3
        remove the element at 3 (Nathan)
        remove the element at 1 (Bishop)
*/
        public static void testRemovingElems(ParentLL list) {

                System.out.println("\n\n" + list.getClass().getName()
                        + " TEST REMOVING* ELEMENTS ------------------------------------------------------------");
                System.out.println("\tActual output:");
                System.out.print("\t| ");

                list.remove(0); // remove empty
                list.add(0, "Landon");
                list.remove(0); // remove from 1-element list
                list.add(0, "Damon");
                list.add(1, "Bishop");
                list.add(2, "Isaiah");
                list.add(3, "Nathan");
                list.remove(3); // remove from end
                list.remove(1); // remove from middle

                System.out.print("\t| ");
                list.printAll();

                System.out.println("\tExpected output:");
                System.out
                        .println("\t| \u001B[31m" + list.getClass().getName() + " invalid index provided: remove(0)\u001B[30m");
                System.out.println("\t| Damon, Isaiah");

                list.clear();
                System.out.println(
                        "\n\t*This test utilizes add() and print(). If it failed, the issue could be in 'print()',\n\t'remove()', or 'add()'.");

        }

}
