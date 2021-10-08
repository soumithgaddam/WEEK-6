package Wallet.state;

public interface State
{
    public abstract void makeWallet();
    public abstract void useWallet();
    public abstract void washWallet();
    public abstract void tornWallet();
}