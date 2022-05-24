package Chapter9;

public class SevenSegment {

        String[][] stack = new String[5][4];

        public void setA() {
            for (int row = 0; row < 1; row++) {
                for (int column = 0; column < 4; column++) {
                    stack[row][column] = "# ";
                }
            }
        }

        public void setB() {
            for (int row = 0; row < 3; row++) {
                for (int column = 3; column < 4; column++) {
                    stack[row][column] = "# ";
                }
            }
        }

        public void setC() {
            for (int row = 3; row < 5; row++) {
                for (int column = 3; column < 4; column++) {
                    stack[row][column] = "# ";
                }
            }
        }

        public void setD() {
            for (int row = 4; row < 5; row++) {
                for (int column = 0; column < 4; column++) {
                    stack[row][column] = "# ";
                }
            }
        }

        public void setE() {
            for (int row = 3; row < 5; row++) {
                for (int column = 0; column < 1; column++) {
                    stack[row][column] = "# ";
                }
            }
        }

        public void setF() {
            for (int row = 1; row < 3; row++) {
                for (int column = 0; column < 1; column++) {
                    stack[row][column] = "# ";
                }
            }
        }
        public void setG(){
            for (int row = 2; row < 3; row++) {
                for (int column = 0; column < 4; column++) {
                    stack[row][column]= "# ";
                }
            }
        }
        public void setSpace() {
            for (int row = 0; row < 5; row++) {
                for (int column = 0; column < 4; column++) {
                    stack[row][column]="  ";
                }
            }
        }
        public void settingDisplay(String input){
            setSpace();
            if (input.charAt(7) == '1') {
                if (input.charAt(0) == '1') {setA();}
                if (input.charAt(1) == '1') {setB();}
                if (input.charAt(2) == '1') {setC();}
                if (input.charAt(3) == '1') {setD();}
                if (input.charAt(4) == '1') {setE();}
                if (input.charAt(5) == '1') {setF();}
                if (input.charAt(6) == '1') {setG();}
            }
        }
        public void display(){
            for (int row = 0; row <=4; row++) {
                for (int column = 0; column <= 3; column++) {
                    System.out.print(stack[row][column]+ " ");
                }
                System.out.println();
            }
        }
    }


