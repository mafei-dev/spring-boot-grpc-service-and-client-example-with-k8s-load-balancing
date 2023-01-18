curl --location --request POST 'http://localhost:12876/grpc-client/points' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username" :"username",
    "amount" : 1,
    "reason" : "SELLER_OFFER"
}'