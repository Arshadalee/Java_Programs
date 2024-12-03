## 1. hashMap.size():
Returns the number of key-value mappings in the HashMap.

## 2. hashMap.isEmpty():
Returns true if the HashMap contains no key-value mappings.

## 3. hashMap.put(K key, V value):
Associates the specified value with the specified key in the HashMap.

## 4. hashMap.putIfAbsent(K key, V value):
If the specified key is not already associated with a value, associates the specified value with the key.

## 5. hashMap.get(Object key):
Returns the value to which the specified key is mapped, or null if the HashMap contains no mapping for the key.

## 6. hashMap.containsKey(Object key):
Returns true if the HashMap contains a mapping for the specified key.

## 7. hashMap.containsValue(Object value):
Returns true if the HashMap contains one or more mappings for the specified value.

## 8. hashMap.remove(Object key):
Removes the mapping for the specified key from the HashMap.

## 9. hashMap.clear():
Removes all mappings from the HashMap.

## 10. hashMap.keySet():
Returns a Set view of the keys contained in the HashMap.

## 11. hashMap.values():
Returns a Collection view of the values contained in the HashMap.

## 12. hashMap.entrySet():
Returns a Set view of the mappings contained in the HashMap.

## 13. hashMap.replace(K key, V value):
Replaces the entry for the specified key only if it is currently mapped to some value.

## 14. hashMap.replace(K key, V oldValue, V newValue):
Replaces the entry for the specified key only if it is currently mapped to the specified old value.

## 15. hashMap.forEach(BiConsumer<? super K, ? super V> action):
Performs the given action for each entry in the HashMap until all entries have been processed or the action throws an exception.

## 16. hashMap.computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction):
If the specified key is not already associated with a value, computes its value using the provided function.

## 17. hashMap.compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction):
Computes a new value for the given key and replaces the old value, or inserts a new mapping if the key is not present.
