package net.thewalkingthread.brainfuck.exceptions;

public class LoopConsistencyException extends BrainfuckException {
    public LoopConsistencyException(Integer in){
        super(in);
    }
}
