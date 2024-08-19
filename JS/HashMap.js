
var HashMap = function() {
    let obj={};
    return {
        put: function(k,v) {
            obj[k]=v;
        },
        keys: function() {
            const keyArray=[];
            for(var keys in obj){
                keyArray.push(keys);
            }
            return keyArray
        },
        contains: function(k) {
            for(var keys in obj){
                if(keys===k){
                    return true;
                }
            }
            return false;
        },
        get: function(k) {
            return obj[k];
        },
        clear: function() {
            obj={};
        }
    };
};