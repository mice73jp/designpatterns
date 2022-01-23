package com.cleanarchitect.state.state;

import com.cleanarchitect.state.context.Context;

public interface State {
    public abstract void doClock(Context context, int hour);
    public abstract void doUse(Context context);
    public abstract void doAlarm(Context context);
    public abstract void doPhone(Context context);
}
