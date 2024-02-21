# CALL GRPCURL

```
 grpcurl -d '{"id":123}' \
-import-path proto \
-proto account/v1/account.proto -plaintext \
localhost:8080 \
account.v1.AccountService/GetAccount

```
