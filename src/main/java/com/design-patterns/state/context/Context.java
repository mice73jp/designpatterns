package com.cleanarchitect.state.context;

import com.cleanarchitect.state.state.State;

public interface Context {
    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurityCenter(String msg);
    public abstract void recordLog(String msg);
}
