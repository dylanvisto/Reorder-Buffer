
package tomasulosalgo;

public class ReorderBuffer {
    
    int register, value, storeValue, done, storeDone, exception, storeException, Matcher, storeInstrIndexE, exceptionCycle;
    
    public ReorderBuffer(int register, int value, int storeValue, int done, int storeDone, int exception, int storeException, int Matcher, int storeInstrIndexE, int exceptionCycle){
        
        this.register = register;
        this.value = value;
        this.storeValue = storeValue;
        this.done = done;
        this.storeDone = storeDone;
        this.exception = exception;
        this.storeException = storeException;
        this.Matcher = Matcher;
        this.storeInstrIndexE = storeInstrIndexE;
        this.exceptionCycle = exceptionCycle;
    }

    public int getExceptionCycle() {
        return exceptionCycle;
    }

    public void setExceptionCycle(int exceptionCycle) {
        this.exceptionCycle = exceptionCycle;
    }

    public int getStoreInstrIndexE() {
        return storeInstrIndexE;
    }

    public void setStoreInstrIndexE(int storeInstrIndexE) {
        this.storeInstrIndexE = storeInstrIndexE;
    }

    public int getStoreValue() {
        return storeValue;
    }

    public void setStoreValue(int storeValue) {
        this.storeValue = storeValue;
    }

    public int getStoreDone() {
        return storeDone;
    }

    public void setStoreDone(int storeDone) {
        this.storeDone = storeDone;
    }

    public int getStoreException() {
        return storeException;
    }

    public void setStoreException(int storeException) {
        this.storeException = storeException;
    }

    
    
    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }

    public int getException() {
        return exception;
    }

    public void setException(int exception) {
        this.exception = exception;
    }

    public int getMatcher() {
        return Matcher;
    }

    public void setMatcher(int Matcher) {
        this.Matcher = Matcher;
    }
    
}
