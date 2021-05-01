def test_case_body(body, comment, index):
    return f"""
    /*
    {comment}
    */
    @Test
    void test{index}() {{
        {body}
    }}"""
