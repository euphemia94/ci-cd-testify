# Create a class called Hunt
# Create a private attribute called __weapon with the value "Assault Rifle" in the Hunt class
# Create a method get_weapon() that returns "Not Available" in the Hunt class
# Instantiate an object of the Hunt class
# Print the value of get_weapon() from the object instance
class Hunt:
    __weapon = "Assault Rifle"
    def get_weapon(self):
        return "not available"
hunt = Hunt()
print(hunt.get_weapon())

