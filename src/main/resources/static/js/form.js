function validateForm(){
    var elem_string = document.forms["form"]["string"];

    array.forEach(elem_string => {
        if(this.value==""){
            alert("Name must be filled");
    
            return false;
        }else if(string.length>100){
            alert("Name too long");

            return false;
        }
    });

}

$(document).ready(function(){
    $('.form').submit(function(e){
        e.preventDefault();
        var name = $('.name').val();
        var first_name = $('.first_name').val();
        var email = $('.email').val();
        var tel_fixe = $('.tel_fixe').val();
        var tel_port = $(".tel_port").val();
        var fax = $('.fax').val();

        $('.error').remove();

        if (name.length < 1) {
            $('.name').after('<span class="error">This field is required</span>');
        }
        if (first_name.length < 1) {
            $('.first_name').after('<span class="error">This field is required</span>');
        }
        if (email.length < 1) {
            $('.email').after('<span class="error">This field is required</span>');
        }else{
            var regexp=/^[A-Z0-9][A-Z0-9._%+-]{0,63}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/;
            var valid_email = regexp.test(email);
            if (!valid_email) {
                $('.email').after('<span class="error">Enter a valid email</span>');
            }
        }
        if (tel_fixe.length < 1) {
            $('tel_fixe').after('<span class="error">This field is required</span>');
        }else{
            var regexp=/^0[0-9]{9}$/;
            var valid_email = regexp.test(email);
            if (!valid_email) {
                $('.email').after('<span class="error">Enter a valid email</span>');
            }
        }
        if (tel_port.length < 1) {
            $('tel_port').after('<span class="error">This field is required</span>');
        }else{
            var regexp=/^0[0-9]{9}$/;
            var valid_email = regexp.test(email);
            if (!valid_email) {
                $('.email').after('<span class="error">Enter a valid email</span>');
            }
        }
        if (fax.length) {
            $('fax').after('<span class="error">This field is required</span>');
        }else{
            var regexp=/^0[0-9]{9}$/;
            var valid_email = regexp.test(email);
            if (!valid_email) {
                $('.email').after('<span class="error">Enter a valid email</span>');
            }
        }
    })


})