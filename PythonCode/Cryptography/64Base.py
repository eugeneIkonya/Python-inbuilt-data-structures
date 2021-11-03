import base64

hex_val = "72bca9b68fc16ac7beeb8f849dca1d8a783e8acf9679bf9269f7bf"
byte_val = bytes.fromhex(hex_val)
print(byte_val)

base_val = base64.b64encode(byte_val)
print(base_val)
