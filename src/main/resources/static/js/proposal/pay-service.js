const payService = (() => {
    const kakaoPay = async () => {
        const response = await Bootpay.requestPayment({
            application_id: "678096b03aa7c4faf96e5460",
            price: 100,
            order_name: "테스트결제",
            order_id: "TEST_ORDER_ID",
            pg: "카카오페이",
            method: "카카오페이",
            tax_free: 0,
            user: {
                id: "회원아이디",
                username: "회원이름",
                phone: "01000000000",
                email: "test@test.com",
            },
            items: [
                {
                    id: "item_id",
                    name: "테스트아이템",
                    qty: 1,
                    price: 100,
                },
            ],
            extra: {
                open_type: "iframe",
                card_quota: "0,2,3",
                escrow: false,
            },
        });
    };
    return{kakaoPay:kakaoPay}
})()
