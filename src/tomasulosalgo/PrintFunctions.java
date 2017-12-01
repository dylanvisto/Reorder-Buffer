//Dylan Visto; Julian Thrash
//Different print functions that are used to properly display the simulation in the console

package tomasulosalgo;

public class PrintFunctions {
    
    
      //Prints off the cycles in which each instruction is Issued, Dispatched, and Written Back 
//    public void printInstInfo(ArrayQueue<Instruction> aq, int numInstr, int[] issue, int[] dispatch, int[] write, int[] commit) 
//    {
//        System.out.println("_________________________________________________________________\n");
//        System.out.println("Instruction        Issue       Dispatch/EX     Write Back     Commit");
//        //Does this operation for the total number of instructions 
//        for(int i = 0; i < numInstr; i++){
//            //Case switch: Gets the opcode for each instruction and depending on the type it will print off the instruction and its cycles
//            switch (aq.observe(i).getOpCode()) {
//                //Add instruction 
//                case 0:
//                    System.out.print("Add R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2() + "       ");
//                    System.out.print(issue[i] + "             ");//Print Issue
//                    System.out.print((dispatch[i]) + "              ");// Print Dispatch
//                    System.out.print(write[i] + "               "); //Print Broadcast
//                    System.out.println(commit[i]);
//                    break;
//                //Subtraction instruction    
//                case 1:
//                    System.out.print("Sub R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2() + "       ");
//                    System.out.print(issue[i] + "            ");//Print Issue
//                    System.out.print((dispatch[i]) + "              ");// Print Dispatch
//                    System.out.print(write[i]  + "               ");//Print Broadcast
//                    System.out.println(commit[i]);
//                    break;
//                case 2:
//                    System.out.print("Mul R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2() + "       ");
//                    System.out.print(issue[i] + "             ");//Print Issue
//                    System.out.print((dispatch[i]) + "              ");// Print Dispatch
//                    System.out.print(write[i]  + "               ");//Print Broadcast
//                    System.out.println(commit[i]);
//                    break;
//                case 3:
//                    System.out.print("Div R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2() + "       ");
//                    System.out.print(issue[i] + "            ");//Print Issue
//                    System.out.print((dispatch[i]) + "              ");// Print Dispatch
//                    System.out.print(write[i]  + "               ");//Print Broadcast
//                    System.out.println(commit[i]);
//                    break;
//                default:
//                    break;
//            }
//        }
//        System.out.println("_________________________________________________________________");
//        System.out.println();
//    }
    
    public void printInstInfo(ArrayQueue<Instruction> aq, int NumOfInstructions, int[] issue, int[] dispatch, int[] write, int[] commit) 
    {
        System.out.println("_______________________________________________________________________\n");
        System.out.println("Instruction        Issue       Dispatch/EX     Write Back      Commit");

        for(int i = 0; i < NumOfInstructions; i++){
            switch (aq.observe(i).getOpCode()) {
                case 0:
                    System.out.print("Add R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2());
                    System.out.format("%8d"+"%15d"+"%15d"+"%15d \n",issue[i],dispatch[i],write[i],commit[i]);
                    break;
                case 1:
                    System.out.print("Sub R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2());
                    System.out.format("%8d"+"%15d"+"%15d"+"%15d \n",issue[i],dispatch[i],write[i],commit[i]);
                    break;
                case 2:
                    System.out.print("Mul R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2());
                    System.out.format("%8d"+"%15d"+"%15d"+"%15d \n",issue[i],dispatch[i],write[i],commit[i]);

                    break;
                case 3:
                    System.out.print("Div R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2());
                    System.out.format("%8d"+"%15d"+"%15d"+"%15d \n",issue[i],dispatch[i],write[i],commit[i]);
                    break;
                default:
                    break;
            }
        }
        System.out.println("______________________________________________________________________");
        System.out.println();
    }
    
    
    //Function to print the RF and RAT
    public void printRFRAT(int[] RF, String[] RAT){
        
        System.out.println("   RF                   RAT");
        System.out.println("-----------------------------"); 
            for(int i = 0; i < 8; i++){
                int length = String.valueOf(RF[i]).length();
                if(length == 2){
                    System.out.println("R" + i + ":     " + RF[i] + "      |        " + RAT[i] + "");
                }
                else
                    System.out.println("R" + i + ":     " + RF[i] + "       |        " + RAT[i] + "");
            }
        System.out.println();
        
    }
    
    //Function to print off the Reservations stations
    public void printRS(ReservationStation rs1, ReservationStation rs2, ReservationStation rs3, ReservationStation rs4, ReservationStation rs5){
        System.out.println("_____________________________________________________________________________");
        System.out.println("       Busy     OP       VJ       VK       Qj       Qk       Disp     DestTag");
        
        if(rs1.getVj().length() == 1 && rs1.getVk().length() == 1){
        System.out.println("RS" + 1 + "    " + rs1.getBusy() + "        "  + rs1.getOp() + "       " + rs1.getVj() + "        " + rs1.getVk() + "       " + rs1.getQj() + "      " + rs1.getQk() + "       " + rs1.getDisp() + "        " + rs1.getDestTag());
        }
        else if(rs1.getVj().length() == 2 && rs1.getVk().length() == 1){
        System.out.println("RS" + 1 + "    " + rs1.getBusy() + "        "  + rs1.getOp() + "      " + rs1.getVj() + "        " + rs1.getVk() + "       " + rs1.getQj() + "      " + rs1.getQk() + "       " + rs1.getDisp()  + "        " + rs1.getDestTag());  
        }
        else if(rs1.getVj().length() == 1 && rs1.getVk().length() == 2){
        System.out.println("RS" + 1 + "    " + rs1.getBusy() + "        "  + rs1.getOp() + "       " + rs1.getVj() + "       " + rs1.getVk() + "       " + rs1.getQj() + "      " + rs1.getQk() + "       " + rs1.getDisp()  + "        " + rs1.getDestTag());  
        }
        else {
        System.out.println("RS" + 1 + "    " + rs1.getBusy() + "        "  + rs1.getOp() + "      " + rs1.getVj() + "       " + rs1.getVk() + "       " + rs1.getQj() + "      " + rs1.getQk() + "       " + rs1.getDisp()   + "        " + rs1.getDestTag());  
        }
        
        if(rs2.getVj().length() == 1 && rs2.getVk().length() == 1){
        System.out.println("RS" + 2 + "    " + rs2.getBusy() + "        "  + rs2.getOp() + "       " + rs2.getVj() + "        " + rs2.getVk() + "       " + rs2.getQj() + "      " + rs2.getQk() + "       " + rs2.getDisp()+ "        " + rs2.getDestTag());
        }
        else if(rs2.getVj().length() == 2 && rs2.getVk().length() == 1){
        System.out.println("RS" + 2 + "    " + rs2.getBusy() + "        "  + rs2.getOp() + "      " + rs2.getVj() + "        " + rs2.getVk() + "       " + rs2.getQj() + "      " + rs2.getQk() + "       " + rs2.getDisp()+ "        " + rs2.getDestTag());  
        }
        else if(rs2.getVj().length() == 1 && rs2.getVk().length() == 2){
        System.out.println("RS" + 2 + "    " + rs2.getBusy() + "        "  + rs2.getOp() + "       " + rs2.getVj() + "       " + rs2.getVk() + "       " + rs2.getQj() + "      " + rs2.getQk() + "       " + rs2.getDisp()+ "        " + rs2.getDestTag());  
        }
        else {
        System.out.println("RS" + 2 + "    " + rs2.getBusy() + "        "  + rs2.getOp() + "      " + rs2.getVj() + "       " + rs2.getVk() + "       " + rs2.getQj() + "      " + rs2.getQk() + "       " + rs2.getDisp()+ "        " + rs2.getDestTag());  
        }
        
        if(rs3.getVj().length() == 1 && rs3.getVk().length() == 1){
        System.out.println("RS" + 3 + "    " + rs3.getBusy() + "        "  + rs3.getOp() + "       " + rs3.getVj() + "        " + rs3.getVk() + "       " + rs3.getQj() + "      " + rs3.getQk() + "       " + rs3.getDisp()+ "        " + rs3.getDestTag());
        }
        else if(rs3.getVj().length() == 2 && rs3.getVk().length() == 1){
        System.out.println("RS" + 3 + "    " + rs3.getBusy() + "        "  + rs3.getOp() + "      " + rs3.getVj() + "        " + rs3.getVk() + "       " + rs3.getQj() + "      " + rs3.getQk() + "       " + rs3.getDisp()+ "        " + rs3.getDestTag()); 
        }
        else if(rs3.getVj().length() == 1 && rs3.getVk().length() == 2){
        System.out.println("RS" + 3 + "    " + rs3.getBusy() + "        "  + rs3.getOp() + "       " + rs3.getVj() + "       " + rs3.getVk() + "       " + rs3.getQj() + "      " + rs3.getQk() + "       " + rs3.getDisp()+ "        " + rs3.getDestTag());  
        }
        else {
        System.out.println("RS" + 3 + "    " + rs3.getBusy() + "        "  + rs3.getOp() + "      " + rs3.getVj() + "       " + rs3.getVk() + "       " + rs3.getQj() + "      " + rs3.getQk() + "       " + rs3.getDisp()+ "        " + rs3.getDestTag());  
        }
        
        if(rs4.getVj().length() == 1 && rs4.getVk().length() == 1){
        System.out.println("RS" + 4 + "    " + rs4.getBusy() + "        "  + rs4.getOp() + "       " + rs4.getVj() + "        " + rs4.getVk() + "       " + rs4.getQj() + "      " + rs4.getQk() + "       " + rs4.getDisp()+ "        " + rs4.getDestTag());
        }
        else if(rs4.getVj().length() == 2 && rs4.getVk().length() == 1){
        System.out.println("RS" + 4 + "    " + rs4.getBusy() + "        "  + rs4.getOp() + "      " + rs4.getVj() + "        " + rs4.getVk() + "       " + rs4.getQj() + "      " + rs4.getQk() + "       " + rs4.getDisp()+ "        " + rs4.getDestTag());  
        }
        else if(rs4.getVj().length() == 1 && rs4.getVk().length() == 2){
        System.out.println("RS" + 4 + "    " + rs4.getBusy() + "        "  + rs4.getOp() + "       " + rs4.getVj() + "       " + rs4.getVk() + "       " + rs4.getQj() + "      " + rs4.getQk() + "       " + rs4.getDisp()+ "        " + rs4.getDestTag());  
        }
        else {
        System.out.println("RS" + 4 + "    " + rs4.getBusy() + "        "  + rs4.getOp() + "      " + rs4.getVj() + "       " + rs4.getVk() + "       " + rs4.getQj() + "      " + rs4.getQk() + "       " + rs4.getDisp()+ "        " + rs4.getDestTag());  
        }
        
        if(rs5.getVj().length() == 1 && rs5.getVk().length() == 1){
        System.out.println("RS" + 5 + "    " + rs5.getBusy() + "        "  + rs5.getOp() + "       " + rs5.getVj() + "        " + rs5.getVk() + "       " + rs5.getQj() + "      " + rs5.getQk() + "       " + rs5.getDisp()+ "        " + rs5.getDestTag());
        }
        else if(rs5.getVj().length() == 2 && rs5.getVk().length() == 1){
        System.out.println("RS" + 5 + "    " + rs5.getBusy() + "        "  + rs5.getOp() + "      " + rs5.getVj() + "        " + rs5.getVk() + "       " + rs5.getQj() + "      " + rs5.getQk() + "       " + rs5.getDisp()+ "        " + rs5.getDestTag());  
        }
        else if(rs5.getVj().length() == 1 && rs5.getVk().length() == 2){
        System.out.println("RS" + 5 + "    " + rs5.getBusy() + "        "  + rs5.getOp() + "       " + rs5.getVj() + "       " + rs5.getVk() + "       " + rs5.getQj() + "      " + rs5.getQk() + "       " + rs5.getDisp()+ "        " + rs5.getDestTag());  
        }
        else {
        System.out.println("RS" + 5 + "    " + rs5.getBusy() + "        "  + rs5.getOp() + "      " + rs5.getVj() + "       " + rs5.getVk() + "       " + rs5.getQj() + "      " + rs5.getQk() + "       " + rs5.getDisp()+ "        " + rs5.getDestTag());  
        }
        
        System.out.println("_____________________________________________________________________________");
        System.out.println();
    }
    
    //Functions to print off the queue
    public void printInstructionQueue(ArrayQueue<Instruction> aq, int numInstr){
        System.out.println("Instruction Queue");
        for(int i = 0; i < numInstr; i++){
            switch (aq.observe(i).getOpCode()) {
                case 0:
                    System.out.println("Add R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2());
                    break;
                case 1:
                    System.out.println("Sub R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2());
                    break;
                case 2:
                    System.out.println("Mul R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2());
                    break;
                case 3:
                    System.out.println("Div R" + aq.observe(i).getDestOp()+ ", R" + aq.observe(i).getSourceOp1()+ ", R" + aq.observe(i).getSourceOp2());
                    break;
                default:
                    break;
            }
        }
        System.out.println();
    }
    
    
    public void printROB(ArrayQueue<ReorderBuffer> rb){
        
        System.out.println("ROB#     REG       VALUE       DONE       EXCEPTION");
        System.out.println("___________________________________________________");
        for(int a = 1; a <=6; a++){
            if(rb.observe(a-1).getRegister() != -1){
                switch (String.valueOf(rb.observe(a-1).getValue()).length()) {
                    case 1:
                        System.out.println("ROB" + a + "      " + "R" + rb.observe(a-1).getRegister() + "          " + rb.observe(a-1).getValue() + "         " + rb.observe(a-1).getDone() + "          " + rb.observe(a-1).getException());
                        break;
                    case 2:
                        System.out.println("ROB" + a + "      " + "R" + rb.observe(a-1).getRegister() + "          " + rb.observe(a-1).getValue() + "         " + rb.observe(a-1).getDone() + "          " + rb.observe(a-1).getException());
                        break;
                    default:
                        System.out.println("ROB" + a + "      " + "R" + rb.observe(a-1).getRegister() + "          " + rb.observe(a-1).getValue() + "         " + rb.observe(a-1).getDone() + "          " + rb.observe(a-1).getException());
                        break;
                }
            }
            else{
                System.out.println("ROB" + a + "       " + "          " +  "         " +  "          ");
            }
            
        }
        System.out.println("___________________________________________________");
    }
    
  
    
    
    
    
    
}
