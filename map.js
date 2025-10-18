// 1. **C**REATE (Initialize the Map and Add Data)
// ------------------------------------------------------------------
const inventory = new Map();

// C - Add initial items (Create)
inventory.set('apple', 100);
inventory.set('banana', 50);
inventory.set('orange', 75);

console.log("--- After Creation (Add) ---");
console.log("Current Inventory:", inventory);
console.log("Size:", inventory.size);

// 2. **R**EAD (Retrieve Data)
// ------------------------------------------------------------------
const applesCount = inventory.get('apple');
const hasGrapes = inventory.has('grape'); // Check for existence

console.log("\n--- Read Operations ---");
console.log("Apples count:", applesCount); // Output: 100
console.log("Has 'grape':", hasGrapes);     // Output: false

// 3. **U**PDATE (Modify Data)
// ------------------------------------------------------------------
inventory.set('apple', 120); // U - Update 'apple' count

console.log("\n--- After Update ---");
console.log("New Apples count:", inventory.get('apple')); // Output: 120
console.log("Current Inventory:", inventory);

// 4. **D**ELETE (Remove Data)
// ------------------------------------------------------------------
const deleteSuccess = inventory.delete('banana'); // D - Delete 'banana'
const deleteFailure = inventory.delete('grape');  // Attempt to delete a non-existent key

console.log("\n--- Delete Operations ---");
console.log("Banana deleted successfully:", deleteSuccess); // Output: true
console.log("Grape deleted successfully:", deleteFailure);  // Output: false
console.log("Current Inventory:", inventory);              // 'banana' is gone

// D - Clear All (Delete All)
inventory.clear();

console.log("\n--- After Clear All ---");
console.log("Final Inventory:", inventory); // Output: Map(0) {}