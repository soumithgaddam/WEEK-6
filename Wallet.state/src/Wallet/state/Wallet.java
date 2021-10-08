package Wallet.state;

public class Wallet
{
    UseState useState;
    WashState washState;
    MakeState makeState;
    TornState tornState;
    State state;

    Wallet()
    {
        useState = new UseState(this);
        washState= new WashState(this);
        tornState = new TornState(this);
        makeState=new MakeState(this);
        state=makeState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public UseState getUseState() {
        return useState;
    }

    public WashState getWashState() {
        return washState;
    }

    public MakeState getMakeState() {
        return makeState;
    }

    public TornState getTornState() {
        return tornState;
    }

    public void makeWallet()  {
        state.makeWallet();
    }

    public void useWallet()  {
        state.useWallet();
    }

    public void washWallet() {
        state.washWallet();
    }
    public void tornWallet() {
        state.tornWallet();
    }


}