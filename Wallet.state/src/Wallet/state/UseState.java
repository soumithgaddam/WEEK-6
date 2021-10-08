package Wallet.state;

public class UseState implements State{

    Wallet wallet;
    public UseState(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void makeWallet() {
        System.out.println("Wallet already brought");
        wallet.setState(wallet.getMakeState());

    }

    @Override
    public void useWallet() {
        System.out.println("Wallets used to keep money");
    }

    @Override
    public void washWallet() {
        System.out.println("washing wallet");
        wallet.setState(wallet.getWashState());
    }

    @Override
    public void tornWallet() {
        System.out.println("Wallet got Torned");
        wallet.setState(wallet.getTornState());
    }


}
