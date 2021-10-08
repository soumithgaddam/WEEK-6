package Wallet.state;

public class WalletBuilder implements Builder{

    WalletBuilder(){

    }

    @Override
    public Builder tanning() {
        System.out.println("leather is tanned");
        return this;
    }

    @Override
    public Builder stitching() {
        System.out.println("wallet is stitched");
        return this;
    }

    @Override
    public Builder polishing() {
        System.out.println("lether is polished ");
        return this;
    }

    @Override
    public Wallet build() {
        Wallet s=new Wallet();
        System.out.println("wallet is made");
        return s;
    }
}