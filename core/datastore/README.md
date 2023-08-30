# :core:datastore module

# DATASTORE
# DataStore uses Kotlin coroutines and Flow to store data asynchronously, consistently, and transactional(ACID : Atomic
# Consistent,Isolation,Durability, When you make changes in your preferences, it ensures that these changes are made securely 
# and won't result in inconsistent data). 

# Shared Preference --> serialize into  and deserialize from XML format. Proto DataStore --> .. protobuf format(
# They are faster, smaller, simpler, and less ambiguous than XML)

# All of the code in the transform block is treated as a single transaction.

# We use DataStore and protocol buffer persist our object to disk
