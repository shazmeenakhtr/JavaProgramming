def check_1d_parity(data, scheme="even"):
    """
    Calculates the parity bit for a given integer.
    scheme: "even" (total 1s should be even) or "odd" (total 1s should be odd)
    """
    # Convert to binary string (stripping the '0b' prefix)
    binary_representation = bin(data)[2:]
    
    # Count the number of set bits (1s)
    ones_count = binary_representation.count('1')
    
    if scheme.lower() == "even":
        # For even parity, if count is already even, parity bit is 0. 
        # If count is odd, parity bit is 1.
        return 0 if ones_count % 2 == 0 else 1
    else:
        # For odd parity, if count is already odd, parity bit is 0.
        return 0 if ones_count % 2 != 0 else 1

# Example usage:
val = 0b1011001  # Decimal 89
parity_bit = check_1d_parity(val, scheme="even")

print(f"Data: {bin(val)[2:]}")
print(f"Even Parity Bit: {parity_bit}")
print(f"Full Frame: {bin(val)[2:]}{parity_bit}")