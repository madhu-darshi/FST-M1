import pytest

@pytest.mark.parametrize("earned,spent,balance",[ (30,15,15),(32,2,30), ])
def test_transaction(wallet_amount, earned, spent, balance):

    print("Initial wallet amount: ", wallet_amount)

    #add earned to wallet
    wallet_amount += earned
    print("wallet amount: ", wallet_amount)

    #subtract the spent
    wallet_amount -= spent
    print("Wallet amount, after spending : ", wallet_amount)

    # verify wallet
    assert wallet_amount == balance
