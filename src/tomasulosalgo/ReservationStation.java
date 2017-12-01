//Dylan Visto; Julian Thrash
//Class that corresponds to a reservation station

package tomasulosalgo;

public class ReservationStation {
    
    String Op, Qj, Qk, Vj, Vk, Busy, Disp, destTag;
    int Matcher, BufferMatcher;
    
    public ReservationStation(){}
    
    public ReservationStation(String Busy, String Op, String Vj, String Vk, String Qj, String Qk, String Disp, int Matcher, int BufferMatcher, String destTag){
        this.Busy = Busy;
        this.Op = Op;
        this.Vj = Vj;
        this.Vk = Vk;
        this.Qj = Qj;
        this.Qk = Qk;
        this.Disp = Disp;
        this.Matcher = Matcher;
        this.destTag = destTag;
        this.BufferMatcher = BufferMatcher;
        
    }

    public int getBufferMatcher() {
        return BufferMatcher;
    }

    public void setBufferMatcher(int BufferMatcher) {
        this.BufferMatcher = BufferMatcher;
    }

    public String getDestTag() {
        return destTag;
    }

    public void setDestTag(String destTag) {
        this.destTag = destTag;
    }

    public int getMatcher() {
        return Matcher;
    }

    public void setMatcher(int Matcher) {
        this.Matcher = Matcher;
    }

    public String getOp() {
        return Op;
    }

    public void setOp(String Op) {
        this.Op = Op;
    }

    public String getQj() {
        return Qj;
    }

    public void setQj(String Qj) {
        this.Qj = Qj;
    }

    public String getQk() {
        return Qk;
    }

    public void setQk(String Qk) {
        this.Qk = Qk;
    }

    public String getVj() {
        return Vj;
    }

    public void setVj(String Vj) {
        this.Vj = Vj;
    }

    public String getVk() {
        return Vk;
    }

    public void setVk(String Vk) {
        this.Vk = Vk;
    }

    public String getBusy() {
        return Busy;
    }

    public void setBusy(String Busy) {
        this.Busy = Busy;
    }

    public String getDisp() {
        return Disp;
    }

    public void setDisp(String Disp) {
        this.Disp = Disp;
    }

    

    @Override
    public String toString() {
        return  Busy + "        "  +  Op + "      " + Vj + "        " + Vk  + "       " + Qj + "      " + Qk + "       " + Disp + "       " + destTag;
    }
    
    
    
}
